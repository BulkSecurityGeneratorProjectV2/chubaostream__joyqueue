webpackJsonp([33],{LpBR:function(t,e,i){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=i("1a0f"),s={name:"applicationDetailSlot",mixins:[i("95hR").a],data:function(){return{urls:{getById:"/topic/getById"},topic:{id:"0",code:"",namespace:{id:"0",code:""}},app:"",tab:"",detail:{id:"0",code:"",name:"",type:"",partitions:"",archive:!1,labels:"",description:""}}},watch:{$route:function(t,e){this.topic.id=t.query.id,this.topic.code=t.query.code,this.topic.namespace.id=t.query.namespaceId,this.topic.namespace.code=t.query.namespaceCode,this.app=t.query.app,this.tab=t.query.tab||this.tab,this.$refs[this.tab].getList()}},methods:{getDetail:function(t){var e=this,i={id:this.topic.id};a.a.post(this.urls.getById,{},i).then(function(t){e.detail=t.data||{}})},gotoList:function(){this.$router.push({name:"/"+this.$i18n.locale+"/topic"})},queryTopicDetail:function(){this.getDetail(this.topic.id)},handleTabChange:function(t){var e=t.name;this.$refs[e].getList(),"retry"===e?this.$router.push({name:"/"+this.$i18n.locale+"/topic/detail",query:{id:this.topic.id,code:this.topic.code,namespaceId:this.topic.namespace.id,namespaceCode:this.topic.namespace.code,tab:e,app:this.$route.query.app||""}}):this.$router.push({name:"/"+this.$i18n.locale+"/topic/detail",query:{id:this.topic.id,code:this.topic.code,namespaceId:this.topic.namespace.id,namespaceCode:this.topic.namespace.code,tab:e}})}},mounted:function(){this.topic.id=this.$route.query.id,this.topic.code=this.$route.query.code,this.topic.namespace.id=this.$route.query.namespaceId,this.topic.namespace.code=this.$route.query.namespaceCode,this.tab=this.$route.query.tab||"producer",this.queryTopicDetail()}},c={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"clearfix",staticStyle:{margin:"20px"}},[i("d-breadcrumb",{staticClass:"mb20",attrs:{separator:">"}},[i("d-breadcrumb-item",{attrs:{to:{name:"/"+t.$i18n.locale+"/topic"}}},[t._v("主题中心")]),t._v(" "),i("d-breadcrumb-item",[t._v(t._s(t.topic.code))])],1),t._v(" "),i("div",{staticClass:"detail mb20"},[i("div",{staticClass:"title"},[t._v(t._s(t.topic.code))]),t._v(" "),i("grid-row",{attrs:{gutter:16}},[i("grid-col",{attrs:{span:"8"}},[i("span",[t._v("队列数:")]),t._v(" "),i("span",[t._v(t._s(t.detail.partitions))])]),t._v(" "),i("grid-col",{attrs:{span:"8"}},[i("span",[t._v("标签:")]),t._v(" "),i("span",[t._v(t._s(t.detail.labels))])]),t._v(" "),i("grid-col",{attrs:{span:"8"}},[i("span",[t._v("备注:")]),t._v(" "),i("span",[t._v(t._s(t.detail.description))])])],1)],1),t._v(" "),i("d-tabs",{attrs:{value:t.tab},on:{"on-change":t.handleTabChange}},[t._t("tabs")],2)],1)},staticRenderFns:[]};var o=i("VU/8")(s,c,!1,function(t){i("qdx6")},"data-v-2afaf5be",null);e.default=o.exports},qdx6:function(t,e){}});
//# sourceMappingURL=33.6e8a1d6a807a7fb5fbe0.js.map