import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SignInComponent} from './pages/sign-in-Buyer/sign-in-Buyer.component';
import {SignInSellerComponent} from './pages/sign-in-Seller/sign-in-Seller.component';
import {SignupBuyerComponent} from './pages/signup-Buyer/signup-Buyer.component';
import {SignupSellerComponent} from './pages/signup-Seller/signup-Seller.component';
import {ItemsComponent} from './pages/Items/Items.component';
import {ItemDetailComponent} from './pages/ItemDetail/ItemDetail.component';
import {CartComponent} from './pages/cart/cart.component';
import { PurchaseHistoryComponent } from './pages/PurchaseHistory/PurchaseHistory.component';
import { PurchaseHistoryDetailComponent } from './pages/PurchaseHistoryDetail/PurchaseHistoryDetail.component';
import { DiscountComponent } from './pages/Discount/Discount.component';
import { ReportComponent } from './pages/Report/Report.component';
import { AddItemComponent } from './pages/AddItem/AddItem.component';
import { UpdateStockComponent } from './pages/UpdateStock/UpdateStock.component';
import { ViewStockComponent } from './pages/View-Stock/View-Stock.component';
import { ReoprtSellerComponent } from './pages/Reoprt-Seller/Reoprt-Seller.component';

const routes: Routes = [
  { path: '', component:ItemsComponent},
  { path: 'signup-buyer', component: SignupBuyerComponent },
  { path: 'signup-seller', component: SignupSellerComponent },
  { path: 'signin-buyer', component: SignInComponent },
  { path: 'signin-seller', component: SignInSellerComponent },
  { path: 'item-detail', component: ItemDetailComponent },
  { path: 'cart', component: CartComponent },
  { path: 'PurchaseHistory', component: PurchaseHistoryComponent},
  { path: 'PurchaseHistoryDetail', component: PurchaseHistoryDetailComponent},
  { path: 'Discount', component: DiscountComponent},
  { path: 'Report', component: ReportComponent},
  { path: 'ReportSeller', component: ReoprtSellerComponent},
  { path: 'AddItem', component: AddItemComponent},
  { path: 'UpdateStock', component: UpdateStockComponent},
  { path: 'ViewStock', component: ViewStockComponent},

];

@NgModule({
  // Registering the RouterModule.forRoot() in the AppModule imports makes the Router service available everywhere in the application.
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
