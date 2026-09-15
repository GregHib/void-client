// Dev auto-login credentials (see DevAutoLogin.kt) are read from the environment of the
// process that runs webpack and inlined as globals, development bundles only. Production
// bundles always get empty strings, so a deployed bundle can never carry them.
const webpack = require('webpack');
const dev = config.mode !== 'production';
config.plugins.push(new webpack.DefinePlugin({
    __VOID_DEV_USERNAME__: JSON.stringify(dev ? (process.env.VOID_DEV_USERNAME || '') : ''),
    __VOID_DEV_PASSWORD__: JSON.stringify(dev ? (process.env.VOID_DEV_PASSWORD || '') : ''),
}));
