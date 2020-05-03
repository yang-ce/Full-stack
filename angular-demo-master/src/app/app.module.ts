import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
/* bootstrap 按需导入，可以使我们最终的打包文件更小 */
// import {NgbPaginationModule, NgbAlertModule} from '@ng-bootstrap/ng-bootstrap';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './component/navbar/navbar.component';
import { FooterComponent } from './component/footer/footer.component';
import { CategoryComponent } from './component/category/category.component';
import {SignInComponent} from './pages/sign-in-Buyer/sign-in-Buyer.component';
import {SignInSellerComponent} from './pages/sign-in-Seller/sign-in-Seller.component';
import { SignupBuyerComponent } from './pages/signup-Buyer/signup-Buyer.component';
import { SignupSellerComponent } from './pages/signup-Seller/signup-Seller.component';
import { ItemsComponent } from './pages/Items/Items.component';
import { ItemDetailComponent } from './pages/ItemDetail/ItemDetail.component';
import { CartComponent } from './pages/cart/cart.component';
import { PurchaseHistoryComponent } from './pages/PurchaseHistory/PurchaseHistory.component';
import { PurchaseHistoryDetailComponent } from './pages/PurchaseHistoryDetail/PurchaseHistoryDetail.component';
import { DiscountComponent } from './pages/Discount/Discount.component';
import { ReportComponent } from './pages/Report/Report.component';
import { AddItemComponent } from './pages/AddItem/AddItem.component';
import { UpdateStockComponent } from './pages/UpdateStock/UpdateStock.component';
import { ViewStockComponent } from './pages/View-Stock/View-Stock.component';
import { ReoprtSellerComponent } from './pages/Reoprt-Seller/Reoprt-Seller.component';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { MoneyPipe } from './pipe/money.pipe';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    SignInComponent,
    MoneyPipe,
    CategoryComponent,
    ItemsComponent,
    ItemDetailComponent,
    SignupBuyerComponent,
    SignupSellerComponent,
    CartComponent,
    PurchaseHistoryComponent,
    PurchaseHistoryDetailComponent,
    DiscountComponent,
    ReportComponent,
    SignInSellerComponent,
    AddItemComponent,
    UpdateStockComponent,
    ViewStockComponent,
    ReoprtSellerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
