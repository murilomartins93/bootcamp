import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TransactionListComponent } from './components/transaction-list/transaction-list.component';
import { TransactionNewComponent } from './components/transaction-new/transaction-new.component';
import { HolderComponent } from './components/holder/holder.component';

const routes: Routes = [

  { path: 'transaction-new', component: TransactionNewComponent },
  { path: 'transaction', component: TransactionListComponent },
  { path: '', redirectTo: 'transaction', pathMatch: 'full' },
  { path: 'holder', component: HolderComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
