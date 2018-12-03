var webpack = require('webpack');
var path = require('path');

var env = {
    context:  path.resolve(__dirname, '../src/main/frontend'),
    src: path.resolve(__dirname, '../src/main/frontend'),
    outputPath: path.resolve(__dirname, '../src/main/resources/static'),
};

module.exports = {
    mode:"development",
    entry:{
        "hello/index":path.resolve(env.src,"hello/index"),
        "stock/candle":path.resolve(env.src,"stock/candle_chart")

    } ,
    devtool: 'eval-source-map',
    module: {
        rules: [{
            test: /\.css$/,
            use: ['style-loader', 'css-loader']
        }]
    },
    output: {
        filename: './[name]_bundle.js',// [name] 自动获取到 entry 配置里的中的 key , key 中的斜杠/ 会被当做目录分隔符
        path: env.outputPath
    },
    resolve: {
        modules: [path.resolve(__dirname,"node_modules")]// 指定了 require("xxx") 时， 应该到当前文件所在目录中的 node_modules 目录去搜索对应依赖
    },
    devServer: {// 监听 contentBase 中内容的改变， 随时发布更新
        contentBase: env.src,//本地服务器所加载的 js 所在目录
        historyApiFallback: true,//不跳转
        inline: true,
        port:9000
    }
};