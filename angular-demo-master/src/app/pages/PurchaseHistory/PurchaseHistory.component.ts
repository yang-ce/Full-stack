import { Component, OnInit } from '@angular/core';
import {UserService} from '../../services/user.service';
import { Router } from '@angular/router';
import { Category } from 'src/app';

interface Item {
  name: string;
  picture: string;
  price: number;
  orderDate: String;
}

const Items: Item[] = [
  {
    name: 'HuaWei',
    picture: 'HuaWei.JPG',
    price: 7000,
    orderDate: '2020/01/01'
  },
  {
    name: 'iPhone',
    picture: 'iPhone.JPG',
    price: 8800,
    orderDate: '2020/01/02'
  },
  {
    name: 'Oppo',
    picture: 'Oppo.JPG',
    price: 6700,
    orderDate: '2020/01/03'
  },
  {
    name: 'Samsung',
    picture: 'Samsung.JPG',
    price: 5600,
    orderDate: '2020/01/04'
  }
];

@Component({
  selector: 'app-PurchaseHistory',
  templateUrl: './PurchaseHistory.component.html',
  styleUrls: ['./PurchaseHistory.component.css']
})
export class PurchaseHistoryComponent implements OnInit {
  items = Items;
  constructor() { }

  ngOnInit() {
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
