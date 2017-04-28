var path = require('path');

module.exports = {
    entry: './src/main/webapp/js/main.js',
    devtool: 'sourcemaps',
    output: {
        path: __dirname,
        filename: './src/main/webapp/js/bundle.js'
    },
    module: {
        loaders: [
            {
                test: path.join(__dirname, '.'),
                exclude: /(node_modules)/,
                loader: 'babel-loader',
                query: {
                    cacheDirectory: true,
                    presets: ['es2015', 'react']
                }
            }
        ]
    }
};