import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app';

interface Item {
  name: string;
  picture: string;
  price: number;
  itemSold: number;

}

const Items: Item[] = [
  {
    name: 'HuaWei',
    picture: 'HuaWei.JPG',
    price: 7000,
    itemSold: 5
  },
  {
    name: 'iPhone',
    picture: 'iPhone.JPG',
    price: 8800,
    itemSold: 1
  },
  {
    name: 'Oppo',
    picture: 'Oppo.JPG',
    price: 6700,
    itemSold: 2
  },
  {
    name: 'Samsung',
    picture: 'Samsung.JPG',
    price: 5600,
    itemSold: 0
  }
];

@Component({
  selector: 'app-Reoprt-Seller',
  templateUrl: './Reoprt-Seller.component.html',
  styleUrls: ['./Reoprt-Seller.component.css']
})
export class ReoprtSellerComponent implements OnInit {
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
