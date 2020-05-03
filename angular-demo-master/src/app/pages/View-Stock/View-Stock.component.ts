import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app';

interface Item {
  name: string;
  picture: string;
  price: number;
  itemSold: number;
  Remaining: number;
}

const Items: Item[] = [
  {
    name: 'HuaWei',
    picture: 'HuaWei.JPG',
    price: 7000,
    itemSold: 5,
    Remaining: 13
  },
  {
    name: 'iPhone',
    picture: 'iPhone.JPG',
    price: 8800,
    itemSold: 1,
    Remaining: 12
  },
  {
    name: 'Oppo',
    picture: 'Oppo.JPG',
    price: 6700,
    itemSold: 2,
    Remaining: 11
  },
  {
    name: 'Samsung',
    picture: 'Samsung.JPG',
    price: 5600,
    itemSold: 0,
    Remaining: 10
  }
];

@Component({
  selector: 'app-View-Stock',
  templateUrl: './View-Stock.component.html',
  styleUrls: ['./View-Stock.component.css']
})
export class ViewStockComponent implements OnInit {
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
