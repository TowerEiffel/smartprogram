'use strict';

// 获取全局应用程序实例对象
var app = getApp();

// 创建页面实例对象
Page({
  /**
   * 页面的初始数据
   */
  data: {
    title: 'index',
    userInfo: null,
    userSite: '定位中',
    navList: [{
      navTitle: '排队取号',
      navIcon: 'iconfont icon-shalou'
    }, {
      navTitle: '预约订座',
      navIcon: 'iconfont icon-chuliyuyue'
    }, {
      navTitle: '扫描单号',
      navIcon: 'iconfont icon-erweima'
    }],
    hotShop: [{
      shopImg: 'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      shopName: '青花椒砂锅鱼'
    }, {
      shopImg: 'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      shopName: '青花椒砂锅鱼'
    }, {
      shopImg: 'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      shopName: '青花椒砂锅鱼'
    }, {
      shopImg: 'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      shopName: '青花椒砂锅鱼'
    }, {
      shopImg: 'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      shopName: '青花椒砂锅鱼'
    }, {
      shopImg: 'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      shopName: '青花椒砂锅鱼'
    }],
    nearShop: [{
      img: 'https://order-foods-img-1256105536.cos.ap-chengdu.myqcloud.com/金掌勺店面图.png',
      name: '金掌勺',
      price: '50',
      kind: '东北菜',
      distance: '1.3km',
      status: '无需排队',
      grade: 'five-star'
    }, {
        img: 'https://order-foods-img-1256105536.cos.ap-chengdu.myqcloud.com/海底捞店面图.png',
      name: '海底捞',
      price: '70',
      kind: '火锅',
      distance: '2.0km',
      status: '无需排队',
      grade: 'four-star'
    }, {
        img: 'https://order-foods-img-1256105536.cos.ap-chengdu.myqcloud.com/山西面店面图.png',
      name: '山西面馆',
      price: '15',
      kind: '面食',
      distance: '3.1km',
      status: '无需排队',
      grade: 'four-star'
    }],
    imgUrls: ['https://order-foods-img-1256105536.cos.ap-chengdu.myqcloud.com/加盟广告图.png',
      'https://order-foods-img-1256105536.cos.ap-chengdu.myqcloud.com/金掌勺店面图.png', 
      'https://order-foods-img-1256105536.cos.ap-chengdu.myqcloud.com/海底捞店面图.png']
  },
  /**
   * 用户选择位置
   * @returns {boolean}
   */
  chooseLocation: function chooseLocation() {
    // console.log(1)
    var that = this;
    wx.chooseLocation({
      success: function success(res) {
        console.log(res);
        if (res.name.length <= 0) {
          return that.setData({
            userSite: res.address
          });
        }
        that.setData({
          userSite: res.name
        });
      }
    });
  },

  /**
   * 用户搜索
   */
  goSearch: function goSearch() {
    wx.navigateTo({
      url: '../search/search'
    });
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function onLoad() {
    var _this = this;

    wx.getLocation({
      success: function success(res) {
        console.log(res);
      }
    });
    console.log(' ---------- onLoad ----------');
    // console.dir(app.data)
    app.getUserInfo().then(function (info) {
      return _this.setData({ userInfo: info });
    }).catch(console.info);
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function onReady() {
    console.log(' ---------- onReady ----------');
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function onShow() {
    console.log(' ---------- onShow ----------');
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function onHide() {
    console.log(' ---------- onHide ----------');
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function onUnload() {
    console.log(' ---------- onUnload ----------');
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function onPullDownRefresh() {
    console.log(' ---------- onPullDownRefresh ----------');
  }
});
//# sourceMappingURL=index.js.map
