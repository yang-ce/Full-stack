/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { SignInSellerComponent } from './sign-in-Seller.component';

describe('SignInSellerComponent', () => {
  let component: SignInSellerComponent;
  let fixture: ComponentFixture<SignInSellerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SignInSellerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SignInSellerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
