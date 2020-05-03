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
  handleSelection(index : number){
    this.selectedIndex = index;
    this.tabSeletcted .emit(this.menus[this.selectedIndex]);
    
  }
  constructor() { }

  ngOnInit(): void {
  }


}
