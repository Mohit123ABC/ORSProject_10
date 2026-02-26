import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-placement',
  templateUrl: './placement.component.html',
  styleUrls: ['./placement.component.css']
})
export class PlacementComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.PLACEMENT, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.placementCode);
    flag = flag && validator.isNotNullObject(form.studentName);
     flag = flag && validator.isNotNullObject(form.companyName);
    flag = flag && validator.isNotNullObject(form.placementStatus);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.placementCode = data.placementCode;
    form.studentName = data.studentName;
    form.companyName = data.companyName;
    form.placementStatus = data.placementStatus;
  }
}