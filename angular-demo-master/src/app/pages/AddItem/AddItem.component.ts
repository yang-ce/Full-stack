import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app';
import { Router } from '@angular/router';


@Component({
  selector: 'app-AddItem',
  templateUrl: './AddItem.component.html',
  styleUrls: ['./AddItem.component.css']
})
export class AddItemComponent implements OnInit {

  
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
