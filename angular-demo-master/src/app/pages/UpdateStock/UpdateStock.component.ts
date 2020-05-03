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
  selector: 'app-UpdateStock',
  templateUrl: './UpdateStock.component.html',
  styleUrls: ['./UpdateStock.component.css']
})
export class UpdateStockComponent implements OnInit {
  items = Items;
  constructor() { }
  ngOnInit() {
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
