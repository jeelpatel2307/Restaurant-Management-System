# Restaurant Management System

The Restaurant Management System is a Python program designed to facilitate the management of a restaurant's menu and customer orders. It allows restaurant staff to manage menu items, display the menu, take customer orders, calculate totals, and display orders.

## Features

- **Menu Management:** Add, display, and retrieve menu items by name and category.
- **Order Management:** Add, display, and calculate totals for customer orders.
- **Flexibility:** Easily customizable to add new menu items or modify existing ones.
- **Efficiency:** Streamlines restaurant operations by automating order management tasks.

## How to Use

1. **Create Menu Items:** Use the `MenuItem` class to create menu items with names, prices, and categories.
2. **Manage Menu:** Use the `Menu` class to add menu items, display the menu, and retrieve items by name.
3. **Place Orders:** Use the `Order` class to create orders, add items to orders, calculate totals, and display orders.

## Example

```python
# Create menu
menu = Menu()

# Add menu items
menu.add_menu_item(MenuItem("Burger", 10.99, "Main Course"))
menu.add_menu_item(MenuItem("Pizza", 12.99, "Main Course"))
menu.add_menu_item(MenuItem("Salad", 8.99, "Appetizer"))
menu.add_menu_item(MenuItem("Ice Cream", 4.99, "Dessert"))

# Display menu
menu.display_menu()

# Create order
order = Order()

# Add items to order
order.add_order_item(OrderItem(menu.get_menu_item("Burger"), 2))
order.add_order_item(OrderItem(menu.get_menu_item("Salad"), 1))
order.add_order_item(OrderItem(menu.get_menu_item("Ice Cream"), 3))

# Display order
order.display_order()

```

## Contributing

Contributions to improve the Restaurant Management System project are welcome! Fork the repository, make your changes, and submit a pull request.

## Credits

This project was created by Jeel patel.
