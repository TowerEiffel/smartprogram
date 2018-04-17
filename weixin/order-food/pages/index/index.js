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
      navTitle: '预约',
      navIcon: 'iconfont icon-shalou'
    }, {
      navTitle: '点餐',
      navIcon: 'iconfont icon-chuliyuyue'
    }, {
      navTitle: '扫描单号',
      navIcon: 'iconfont icon-erweima'
    }],
    notice: [{
      imgUrl: '../../images/reduce.png',
      notice: '满100减5，满200减15，满300减15'
    }, {
      imgUrl: '../../images/new.png',
      notice: '新用户下单立减10元'
    }, {
      imgUrl: '../../images/msg.png',
      notice: '凡劳动节当天到店均有好礼相送'
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
