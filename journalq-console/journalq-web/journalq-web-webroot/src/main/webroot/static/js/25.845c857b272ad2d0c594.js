webpackJsonp([25],{AXJN:function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var r=e("lcoF"),o=e("X2Oc"),s={name:"config-form",mixins:[r.a],props:{type:0,data:{type:Object,default:function(){return{id:"0",key:"",value:"",name:"",group:"",password:0}}}},methods:{getFormData:function(){return this.formData.password="true"===this.password?1:0,this.formData}},data:function(){return{formData:this.data,password:"false",rules:{key:Object(o.g)(),name:Object(o.h)(),group:Object(o.g)(),value:[{required:!0,message:"请填写值",trigger:"change"}]}}},mounted:function(){this.password=1===this.data.password?"true":"false"}},l={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("d-form",{ref:"form",staticStyle:{height:"350px",width:"100%","padding-right":"20px"},attrs:{model:t.formData,rules:t.rules,"label-width":"100px"}},[e("d-form-item",{staticStyle:{width:"60%"},attrs:{label:"键:",placeholser:"支持字母大小写、数字、. _ / -,首字母",prop:"key"}},[t.type==t.$store.getters.editFormType?e("d-input",{attrs:{disabled:""},model:{value:t.formData.key,callback:function(a){t.$set(t.formData,"key",a)},expression:"formData.key"}}):e("d-input",{model:{value:t.formData.key,callback:function(a){t.$set(t.formData,"key",a)},expression:"formData.key"}})],1),t._v(" "),e("d-form-item",{staticStyle:{width:"60%"},attrs:{label:"分组:",placeholser:"支持字母大小写、数字、. _ / -,首字母",prop:"group"}},[t.type==t.$store.getters.editFormType?e("d-input",{attrs:{disabled:""},model:{value:t.formData.group,callback:function(a){t.$set(t.formData,"group",a)},expression:"formData.group"}}):e("d-input",{model:{value:t.formData.group,callback:function(a){t.$set(t.formData,"group",a)},expression:"formData.group"}})],1),t._v(" "),e("d-form-item",{staticStyle:{width:"60%"},attrs:{label:"值:",prop:"value"}},[e("d-input",{model:{value:t.formData.value,callback:function(a){t.$set(t.formData,"value",a)},expression:"formData.value"}})],1),t._v(" "),e("d-form-item",{attrs:{label:"是否为密码:",prop:"password"}},[e("d-radio-group",{attrs:{name:"radiogroup"},model:{value:t.password,callback:function(a){t.password=a},expression:"password"}},[e("d-radio",{attrs:{label:"true"}},[t._v("是")]),t._v(" "),e("d-radio",{attrs:{label:"false"}},[t._v("否")])],1)],1)],1)},staticRenderFns:[]};var i=e("VU/8")(s,l,!1,function(t){e("klaZ")},"data-v-6be3d47b",null);a.default=i.exports},klaZ:function(t,a){}});
//# sourceMappingURL=25.845c857b272ad2d0c594.js.map