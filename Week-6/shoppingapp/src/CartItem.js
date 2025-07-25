import React from 'react';

const CartItem = (props) => {
  return (
    <li>
      <strong>Item:</strong> {props.item.itemname} | <strong>Price:</strong> ₹{props.item.price}
    </li>
  );
};

export default CartItem;
