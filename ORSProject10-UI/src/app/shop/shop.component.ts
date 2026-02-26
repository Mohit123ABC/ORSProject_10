import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.css']
})
export class ShopComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
      super(locator.endpoints.SHOP, locator, route);
    }
  
    onUpload(userform: FormData) {
      this.submit();
      console.log(this.form.data.id + '---- after submit');
  
    }
  
    validateForm(form) {
      let flag = true;
      let validator = this.serviceLocator.dataValidator;
      flag = flag && validator.isNotNullObject(form.shopName);
      flag = flag && validator.isNotNullObject(form.ownerName);
      flag = flag && validator.isNotNullObject(form.city);
     
  
      return flag;
    }
  
    populateForm(form, data) {
      form.id = data.id;
      form.shopName = data.shopName;
      form.ownerName = data.ownerName;
      form.city = data.city;
      
    }
  
  

}
