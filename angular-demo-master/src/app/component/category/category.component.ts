import { Component, OnInit, Input, EventEmitter, Output, NgModule, } from '@angular/core';
import { cornflowerblue } from 'color-name';
import { Router } from '@angular/router';

export interface Category {
  title: string;
  link?: string;
}

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})

export class CategoryComponent implements OnInit {
  selectedIndex = -1;
  title = 'pinduoduo';
  @Input() menus : Category[] = [];
  @Input() backgroundColor = '#fff';
  @Output() tabSeletcted = new EventEmitter();
  @Output() navClick = new EventEmitter<string>();
  constructor(private router: Router){}

  isSignin:boolean;

  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    if(sessionStorage.getItem('token')){
      this.isSignin = true;
    } else {
      this.isSignin = false;
    }
  }

  ngDoCheck(): void {
    //Called every time that the input properties of a component or a directive are checked. Use it to extend change detection by performing a custom check.
    //Add 'implements DoCheck' to the class.
    console.log('docheck');
    if(sessionStorage.getItem('token')){
      this.isSignin = true;
    } else {
      this.isSignin = false;
    }
  }

  signOut(){
    sessionStorage.removeItem('token');
    this.router.navigate(['/']);
  }

  handleSelection(index : number){
    this.selectedIndex = index;
    this.tabSeletcted .emit(this.menus[this.selectedIndex]);
    
  }
  



}
