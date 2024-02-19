class MenuItem:
    def __init__(self, name, price, category):
        self.name = name
        self.price = price
        self.category = category


class Menu:
    def __init__(self):
        self.menu_items = []

    def add_menu_item(self, item):
        self.menu_items.append(item)

    def display_menu(self):
        print("Menu:")
        for item in self.menu_items:
            print(f"{item.name} - ${item.price} - {item.category}")

    def get_menu_item(self, name):
        for item in self.menu_items:
            if item.name.lower() == name.lower():
                return item
        return None


class OrderItem:
    def __init__(self, menu_item, quantity):
        self.menu_item = menu_item
        self.quantity = quantity


class Order:
    def __init__(self):
        self.order_items = []

    def add_order_item(self, item):
        self.order_items.append(item)

    def calculate_total(self):
        total = 0
        for item in self.order_items:
            total += item.menu_item.price * item.quantity
        return total

    def display_order(self):
        print("Order:")
        for item in self.order_items:
            print(f"{item.menu_item.name} - ${item.menu_item.price} - Quantity: {item.quantity}")
        print(f"Total: ${self.calculate_total()}")


def main():
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


if __name__ == "__main__":
    main()
