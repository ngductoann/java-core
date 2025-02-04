Create an application for controlling a smart kitchen.

```mermaid
classDiagram
SmartKitchen *-- Refrigerator
SmartKitchen *-- DishWasher
SmartKitchen *-- CoffeeMaker
  class SmartKitchen{
  brewMaster: CoffeeMaker
  dishWasher: DishWasher
  iceBox: Refrigerator
  addWater()
  pourMilk()
  loadDishwasher()
  setKitchenState(boolean, boolean, boolean)
  doKitchenWork()
}
class Refrigerator{
  hasWorkToDo: boolean
  orderFood()
}
class DishWasher{
  hasWorkToDo: boolean
  doDishes()
}
class CoffeeMaker{
hasWorkToDo: boolean
brewCoffee()
}
```

Methods on your SmartKitchen class, will determine what work needs to be done:

- addWater() will set the Coffee Maker's hasWorkToDo field to true.
- pourMilk() will set the Refrigerator hasWorkToDo field to true.
- loadDishwasher() will set the hasWorkToDo flag to true for that appliance.
- setKitchenState() that takes three boolean values, which would set each
  appliance accordingly.
