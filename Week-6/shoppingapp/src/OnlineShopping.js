// src/OnlineShopping.js
import React, { Component } from 'react';
import Cart from './Cart';
import './OnlineShopping.css'; // for styling

class OnlineShopping extends Component {
  constructor(props) {
    super(props);

    this.items = [
      new Cart('Laptop', 80000),
      new Cart('TV', 120000),
      new Cart('Washing Machine', 50000),
      new Cart('Mobile', 30000),
      new Cart('Fridge', 70000)
    ];
  }

  render() {
    return (
      <div className="container">
        <h2 className="title">Items Ordered :</h2>
        <table className="cart-table">
          <thead>
            <tr>
              <th>Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {this.items.map((item, index) => (
              <tr key={index}>
                <td>{item.itemname}</td>
                <td>{item.price}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;
