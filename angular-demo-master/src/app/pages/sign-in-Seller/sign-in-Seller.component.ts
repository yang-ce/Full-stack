import { Component, OnInit } from '@angular/core';
import {UserService} from '../../services/user.service';
import { Router } from '@angular/router';
import { Category } from 'src/app';

interface Alert {
  type: string;
  message: string;
}

const ALERTS: Alert[] = [];

@Component({
  selector: 'app-sign-in-Seller',
  templateUrl: './sign-in-Seller.component.html',
  styleUrls: ['./sign-in-Seller.component.css']
})
export class SignInSellerComponent implements OnInit {

  alerts: Alert[];

  constructor(private userService: UserService, private router: Router) {
    this.reset();
  }

  ngOnInit(): void {
  }
  
  /* 登录操作 */
  onSubmit(value: any) {
    if (this.validInput(value)) {
      this.userService.postSignIn(value,value.name,value.password).subscribe(
        data => {
          console.log(JSON.stringify(data));
          const info: any = data;
          if (info.access_token != null ) {
              console.log('登录成功，调转详情页');
              this.router.navigate(['/']);
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
    title: 'Add Item',
    link: '/AddItem'
    },
    {
      title: 'Update Stock',
      link: "/UpdateStock"
    },
    {
      title: 'View Stock',
      link: '/ViewStock'
    },
    {
      title: 'Reports',
      link: '/ReportSeller'
    }

    
];



handleTabSelected(topMenu: Category){
  console.log(topMenu);
}
}
