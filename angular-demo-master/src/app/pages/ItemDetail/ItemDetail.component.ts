import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ItemDetail',
  templateUrl: './ItemDetail.component.html',
  styleUrls: ['./ItemDetail.component.css']
})
export class ItemDetailComponent implements OnInit {


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