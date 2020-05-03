import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app';

interface Item {
  name: string;
  picture: string;
  price: number;
  count: number;
}

const Items: Item[] = [
  {
    name: 'HuaWei',
    picture: 'HuaWei.JPG',
    price: 7000,
    count: 1
  },
  {
    name: 'iPhone',
    picture: 'iPhone.JPG',
    price: 8800,
    count: 2
  },
  {
    name: 'Oppo',
    picture: 'Oppo.JPG',
    price: 6700,
    count: 3
  },
  {
    name: 'Samsung',
    picture: 'Samsung.JPG',
    price: 5600,
    count: 4
  }
];

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
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

