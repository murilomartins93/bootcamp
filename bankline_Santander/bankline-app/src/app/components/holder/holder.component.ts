import { Component, OnInit } from '@angular/core';
import { HolderService } from 'src/app/services/holder.service';


@Component({
  selector: 'app-holder',
  templateUrl: './holder.component.html',
  styleUrls: ['./holder.component.css']
})
export class HolderComponent implements OnInit {

  holders:any;
  cpf:any;
  name:any;

  constructor(private holderService: HolderService) { }
        
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
    const holder = {
      cpf:this.cpf,
      name:this.name
    };
    console.log(holder);
    this.holderService.create(holder)
      .subscribe(
        response => {
          console.log(response);
          this.showHolders();
        },
        error => {
          console.log(error);
        });
  }

}
