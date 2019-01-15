define({ "api": [
  {
    "type": "post",
    "url": "/address/add",
    "title": "新增收货地址",
    "group": "Address",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "userId",
            "description": "<p>用户id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "postcode",
            "description": "<p>邮政编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "province",
            "description": "<p>省份</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "city",
            "description": "<p>城市</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "detail",
            "description": "<p>详细地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "recipient",
            "description": "<p>收件人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>联系电话</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    phonenumber:18320444510\n    userId:1\n    postcode:510006\n    province:广东省\n    city:广州市\n    detail:广州中医药大学大学城校区学生宿舍K722\n    recipient:我在跑步不好意思\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 15,\n    \"userId\": 1,\n    \"postcode\": \"510006\",\n    \"province\": \"广东省\",\n    \"city\": \"广州市\",\n    \"detail\": \"广州中医药大学大学城校区学生宿舍K722\",\n    \"recipient\": \"我在跑步不好意思\",\n    \"phonenumber\": \"18320444510\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/AddressController.java",
    "groupTitle": "用户地址",
    "name": "PostAddressAdd"
  },
  {
    "type": "post",
    "url": "/address/byUser",
    "title": "获取特定用户的地址列表",
    "group": "Address",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>用户的id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/AddressController.java",
    "groupTitle": "用户地址",
    "name": "PostAddressByuser"
  },
  {
    "type": "post",
    "url": "/address/delete",
    "title": "删除地址",
    "group": "Address",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>地址id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:14\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": \"ok\"\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/AddressController.java",
    "groupTitle": "用户地址",
    "name": "PostAddressDelete"
  },
  {
    "type": "post",
    "url": "/address/update",
    "title": "更改地址信息",
    "group": "Address",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>地址id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "userId",
            "description": "<p>用户id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "postcode",
            "description": "<p>邮政编码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "province",
            "description": "<p>省份</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "city",
            "description": "<p>城市</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "detail",
            "description": "<p>详细地址</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "recipient",
            "description": "<p>收件人</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>联系电话</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    phonenumber:18320444510\n    userId:1\n    postcode:510006\n    province:广东省\n    city:广州市\n    detail:广州中医药大学大学城校区学生宿舍K722\n    recipient:我已经跑完步了\n    id:15\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 15,\n    \"userId\": 1,\n    \"postcode\": \"510006\",\n    \"province\": \"广东省\",\n    \"city\": \"广州市\",\n    \"detail\": \"广州中医药大学大学城校区学生宿舍K722\",\n    \"recipient\": \"我已经跑完步了\",\n    \"phonenumber\": \"18320444510\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/AddressController.java",
    "groupTitle": "用户地址",
    "name": "PostAddressUpdate"
  },
  {
    "type": "post",
    "url": "/admin/login",
    "title": "管理员登录",
    "group": "Admin",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    password:123\n    phonenumber:18320444510\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 1,\n    \"nickname\": \"我是管理员\",\n    \"password\": \"123\",\n    \"phonenumber\": \"18320444515\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/AdminController.java",
    "groupTitle": "管理员",
    "name": "PostAdminLogin"
  },
  {
    "type": "get",
    "url": "/gbrief/getList",
    "title": "获取商品简要列表",
    "group": "GoodBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "sortId",
            "description": "<p>分类的id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n     sortId:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"id\": 1,\n    \"name\": \"人参\",\n    \"buy\": 2,\n    \"volume\": 20,\n    \"smallPic\": null,\n    \"price\": 10,\n    \"sortId\": 1,\n    \"startTime\": 1542899893,\n    \"endTime\": 1542986293\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/GoodBriefController.java",
    "groupTitle": "商品简要",
    "name": "GetGbriefGetlist"
  },
  {
    "type": "get",
    "url": "/gdetail/one",
    "title": "按id获取商品详情",
    "group": "GoodDetail",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>商品的id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request: ",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/GoodDetailController.java",
    "groupTitle": "商品详细",
    "name": "GetGdetailOne"
  },
  {
    "type": "get",
    "url": "/orders/user",
    "title": "获取用户的历史订单",
    "group": "Orders",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "userId",
            "description": "<p>用户ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    userId:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"id\": 16,\n    \"userId\": 1,\n    \"gbriefId\": 1,\n    \"buy\": 3,\n    \"addressId\": 15,\n    \"paid\": true,\n    \"send\": true,\n    \"dcompany\": \"顺丰速运\",\n    \"did\": \"1234567\"\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/OrdersController.java",
    "groupTitle": "用户订单",
    "name": "GetOrdersUser"
  },
  {
    "type": "post",
    "url": "/orders/add",
    "title": "提交订单",
    "group": "Orders",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "gbriefId",
            "description": "<p>商品id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "buy",
            "description": "<p>购买数量</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "addressId",
            "description": "<p>地址ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    userId:1\n    gbriefId:1\n    buy:3\n    addressId:15\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 16,\n    \"userId\": 1,\n    \"gbriefId\": 1,\n    \"buy\": 3,\n    \"addressId\": 15,\n    \"paid\": false,\n    \"send\": false,\n    \"dcompany\": null,\n    \"did\": null\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/OrdersController.java",
    "groupTitle": "用户订单",
    "name": "PostOrdersAdd"
  },
  {
    "type": "post",
    "url": "/orders/update",
    "title": "修改订单信息",
    "group": "Orders",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>订单ID</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "send",
            "description": "<p>是否已发货</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "paid",
            "description": "<p>是否已支付</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "dCompany",
            "description": "<p>快递公司名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "dId",
            "description": "<p>快递单号</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:16\n    send:true\n    paid:true\n    dCompany:顺丰速运\n    dId:1234567\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 16,\n    \"userId\": 1,\n    \"gbriefId\": 1,\n    \"buy\": 3,\n    \"addressId\": 15,\n    \"paid\": true,\n    \"send\": true,\n    \"dcompany\": \"顺丰速运\",\n    \"did\": \"1234567\"\n    }\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/OrdersController.java",
    "groupTitle": "用户订单",
    "name": "PostOrdersUpdate"
  },
  {
    "type": "get",
    "url": "/sort/getList",
    "title": "获取所有分类",
    "group": "Sort",
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"id\": 1,\n    \"name\": \"药材\",\n    \"description\": \"这个分类包括各种药材\"\n    },\n    {\n    \"id\": 2,\n    \"name\": \"水果\",\n    \"description\": \"这个分类包括各种健康水果\"\n    },\n    {\n    \"id\": 3,\n    \"name\": \"健康制品\",\n    \"description\": \"包括各健康养生的食品轻工业制品\"\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/SortController.java",
    "groupTitle": "商品种类",
    "name": "GetSortGetlist"
  },
  {
    "type": "post",
    "url": "/user/add",
    "title": "添加用户",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "nickname",
            "description": "<p>昵称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n  nickname:我是昵称\n    password:123456\n    phonenumber:18320444511\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 1,\n    \"nickname\": \"我是昵称\",\n    \"password\": \"123456\",\n    \"phonenumber\": \"18320444511\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/UserController.java",
    "groupTitle": "用户",
    "name": "PostUserAdd"
  },
  {
    "type": "post",
    "url": "/user/delete",
    "title": "删除用户",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>用户id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": \"ok\"\n    }",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/UserController.java",
    "groupTitle": "用户",
    "name": "PostUserDelete"
  },
  {
    "type": "post",
    "url": "/user/login",
    "title": "用户登录",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    password:123\n    phonenumber:18320444510\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 1,\n    \"nickname\": \"我是昵称1\",\n    \"password\": \"123\",\n    \"phonenumber\": \"18320444510\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/UserController.java",
    "groupTitle": "用户",
    "name": "PostUserLogin"
  },
  {
    "type": "post",
    "url": "/user/update",
    "title": "更新用户信息",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>用户id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "nickname",
            "description": "<p>昵称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phonenumber",
            "description": "<p>手机号</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    nickname:我是昵称1\n    password:123\n    phonenumber:18320444510\n    id:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"id\": 1,\n    \"nickname\": \"我是昵称1\",\n    \"password\": \"123\",\n    \"phonenumber\": \"18320444510\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/homework/healthshop/controller/UserController.java",
    "groupTitle": "用户",
    "name": "PostUserUpdate"
  }
] });
