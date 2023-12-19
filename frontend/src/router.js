
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Bc1AManager from "./components/listers/Bc1ACards"
import Bc1ADetail from "./components/listers/Bc1ADetail"

import Bc2AManager from "./components/listers/Bc2ACards"
import Bc2ADetail from "./components/listers/Bc2ADetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/bc1s/as',
                name: 'Bc1AManager',
                component: Bc1AManager
            },
            {
                path: '/bc1s/as/:id',
                name: 'Bc1ADetail',
                component: Bc1ADetail
            },

            {
                path: '/bc2s/as',
                name: 'Bc2AManager',
                component: Bc2AManager
            },
            {
                path: '/bc2s/as/:id',
                name: 'Bc2ADetail',
                component: Bc2ADetail
            },



    ]
})
