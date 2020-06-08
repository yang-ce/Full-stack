import { Component, OnInit } from '@angular/core';
import {UserService} from '../../services/user.service';
import { Router } from '@angular/router';
import { Category } from 'src/app';
import { Key } from 'protractor';

interface Alert {
  type: string;
  message: string;
}

const ALERTS: Alert[] = [];

@Component({
  selector: 'app-sign-in-buyer',
  templateUrl: './sign-in-Buyer.component.html',
  styleUrls: ['./sign-in-Buyer.component.css']
})

export class SignInComponent implements OnInit {

  alerts: Alert[];

  constructor(private userService: UserService, private router: Router) {
    this.reset();
  }

  ngOnInit(): void {
    if(sessionStorage.getItem('token')) {
      this.router.navigate(['/']);
    }
  }
  
  /* 登录操作 */
  onSubmit(value: any) {
    if (this.validInput(value)) {
      this.userService.postSignIn(value,value.name,value.password).subscribe(
        data => {
          console.log(JSON.stringify(data));
          const info: any = data;
          if (info.access_token != null) {
              console.log('登录成功，调转详情页' + info.access_token );
              sessionStorage.setItem('token',info.access_token)
              this.router.navigate(['/']);

          }else if(info.code = 400)
          {
            console.log('登录失败，弹出MSG'+ info.access_token);
            this.alerts.push({type : 'danger', message: 'username or password error!'});
          } else {
            console.log('登录失败，弹出MSG'+ info.access_token);
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
