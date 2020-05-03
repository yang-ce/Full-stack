import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app';

interface Item {
  name: string;
  picture: string;
  price: number;
  seller: string;
}

const Items: Item[] = [
  {
    name: 'HuaWei',
    picture: 'HuaWei.JPG',
    price: 7000,
    seller: 'seller1'
  },
  {
    name: 'iPhone',
    picture: 'iPhone.JPG',
    price: 8800,
    seller: 'seller2'
  },
  {
    name: 'Oppo',
    picture: 'Oppo.JPG',
    price: 6700,
    seller: 'seller3'
  },
  {
    name: 'Samsung',
    picture: 'Samsung.JPG',
    price: 5600,
    seller: 'seller4'
  }
];

@Component({
  selector: 'app-Items',
  templateUrl: './Items.component.html',
  styleUrls: ['./Items.component.css']
})
export class ItemsComponent implements OnInit {
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
