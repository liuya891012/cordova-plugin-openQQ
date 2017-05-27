var exec = require('cordova/exec');


var OpenQQPlugin = function () {}
// arg1：成功回调; arg2：失败回调; arg3：将要调用类配置的标识; arg4：调用的原生方法名; arg5：参数，json格式
   OpenQQPlugin.prototype.openQQ = function (success, error,arg0) {
    exec(success, error, "OpenQQPlugin", "openQQ", [arg0]);
  };

var openQQPlugin=new OpenQQPlugin();
module.exports = openQQPlugin;
