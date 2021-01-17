import axios from "axios";

const API_URL = 'https://renan-sds2-dsdeliver.herokuapp.com';

export function fetchOrders() {
    return axios(`${API_URL}/orders`);
}