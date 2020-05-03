import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app';

interface Item {
  name: string;
  picture: string;
  price: number;
  itemPurchase: number;
}

const Items: Item[] = [
  {
    name: 'HuaWei',
    picture: 'HuaWei.JPG',
    price: 7000,
    itemPurchase: 5
  },
  {
    name: 'iPhone',
    picture: 'iPhone.JPG',
    price: 8800,
    itemPurchase: 1
  },
  {
    name: 'Oppo',
    picture: 'Oppo.JPG',
    price: 6700,
    itemPurchase: 2
  },
  {
    name: 'Samsung',
    picture: 'Samsung.JPG',
    price: 5600,
    itemPurchase: 0
  }
];

@Component({
  selector: 'app-Report',
  templateUrl: './Report.component.html',
  styleUrls: ['./Report.component.css']
})
export class ReportComponent implements OnInit {
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
