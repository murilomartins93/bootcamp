import { Component, OnInit } from '@angular/core';
import { HolderService } from 'src/app/services/holder.service';
import { TransactionService } from 'src/app/services/transaction.service';

@Component({
  selector: 'app-transaction-new',
  templateUrl: './transaction-new.component.html',
  styleUrls: ['./transaction-new.component.css']
})
export class TransactionNewComponent implements OnInit {

  holders:any;
  holder: any;
  value: any;
  description: any;
  type: any;
  dateTime: any;
  
  constructor(private TransactionService: TransactionService,
    private holderService: HolderService,
    ) { }

  ngOnInit(): void {
    this.showHolders();
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

  save(): void {
    console.log(this.holders)
    const transaction = {
      value:this.value,
      description:this.description,
      type:this.type,
      idAcc:this.holder.id,
      dateTime:this.dateTime
    };
    console.log(transaction);
    this.TransactionService.create(transaction)
      .subscribe(
        response => {
          console.log(response);
        },
        error => {
          console.log(error);
        });
  }

}
