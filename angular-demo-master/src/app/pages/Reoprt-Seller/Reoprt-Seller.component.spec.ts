/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { ReoprtSellerComponent } from './Reoprt-Seller.component';

describe('ReoprtSellerComponent', () => {
  let component: ReoprtSellerComponent;
  let fixture: ComponentFixture<ReoprtSellerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReoprtSellerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReoprtSellerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
