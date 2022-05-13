import { Component, OnInit } from '@angular/core';
import { HolderService } from 'src/app/services/holder.service';
import { TransactionService } from 'src/app/services/transaction.service';

@Component({
  selector: 'app-transaction-list',
  templateUrl: './transaction-list.component.html',
  styleUrls: ['./transaction-list.component.css']
})

export class TransactionListComponent implements OnInit {

  transactions: any;
  holders: any;
  holder: any;

  constructor(private transactionService: TransactionService, private holderService: HolderService,) { }

  ngOnInit(): void {
    this.showHolders();
  }

  listTransactions(): void {
    this.transactionService.findByIdAcc(this.holder.id)
      .subscribe(
        data => {
          this.transactions = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  showHolders(): void {
    this.holderService.list()
      .subscribe(
        data => {
          this.holders = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

}
