import { Component, OnInit } from '@angular/core';
import {SignupService} from '../../services/signup-Buyer.service';
import { Router } from '@angular/router';
import { Category } from 'src/app';

interface Alert {
  type: string;
  message: string;
}

const ALERTS: Alert[] = [];

@Component({
  selector: 'app-signup-Buyer',
  templateUrl: './signup-Buyer.component.html',
  styleUrls: ['./signup-Buyer.component.css']
})


export class SignupBuyerComponent implements OnInit {

  alerts: Alert[];

  constructor(private signupService: SignupService, private router: Router) {
    this.reset();
  }

  ngOnInit(): void {
  }

  /* 登录操作 */
  onSubmit(value: any) {
    if (this.validInput(value)) {
      this.signupService.postSignUp(value).subscribe(
        data => {
          console.log(JSON.stringify(data));
          const info: any = data;
          if (200 === info.code) {
              console.log('登录成功，调转详情页');
              this.router.navigate(['/products']);
          } else {
            console.log('登录失败，弹出MSG');
            this.alerts.push({type : 'danger', message: 'username or password error!'});

          }
        }
      );
    }
  }
  /* 验证输入项 */
  validInput(value: any): boolean {
    this.reset();
    if (!value.name) {
      this.alerts.push({type : 'danger', message: 'username required!'});
      return false;
    }

    if (!value.password) {
      this.alerts.push({type : 'danger', message: 'password required!'});
      return false;
    }

    if (value.password.length < 6) {
      this.alerts.push({type : 'danger', message: 'password length must be greater than 6!'});
      return false;
    }
    if (value.confirmpassword.length < 6) {
      this.alerts.push({type : 'danger', message: 'confirmpassword length must be greater than 6!'});
      return false;
    }
    if (value.confirmpassword != value.password) {
      this.alerts.push({type : 'danger', message: 'Password is different from confirm password'});
      return false;
    }
    if (!value.tel) {
      this.alerts.push({type : 'danger', message: 'Password is different from confirm password'});
      return false;
    }
    return true;
  }

  close(alert: Alert) {
    this.alerts.splice(this.alerts.indexOf(alert), 1);
  }

  reset() {
    this.alerts = Array.from(ALERTS);
  }
  topMenus : Category[] = [
    {
    title: 'Buy Item',
    link: ''
    },
    {
      title: 'Purchase History',
      link: "/PurchaseHistory"
    },
    {
      title: 'View Discounts',
      link: '/Discount'
    },
    {
      title: 'Reports',
      link: '/Report'
    }

    
];



handleTabSelected(topMenu: Category){
  console.log(topMenu);
}
}
