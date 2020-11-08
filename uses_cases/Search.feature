Feature: Searching for a house 
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_No_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_No_ELEVATOR|230_120_4_2_12|
Scenario: Searching House by Placement
When I search about home by "City"
Then A list of homes that matches the placement specification should be returned and printed on the console 
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Searching House by Type 
When I search about home by "House"
Then A list of homes that matches the placement specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Searching House by Material 
When I search about home by "Wood"
Then A list of homes that matches the placement specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

 Scenario: Search about home with less than a specific price
When I search about home with "price" less than 600
Then A list of homes that matches the price specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about home within a specific range of prices 
When I search about home with "price" between 100 and 400
Then A list of homes that matches the price range specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about home with area less than a specific int
When I search about home with "area" less than 140 
Then A list of homes that matches the area specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"


Scenario: Search about home within a specific range of areas 
When I search about home with "area" between 500 and 600
Then A list of homes that matches the area range specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Searching House by Bedrooms 
When I search about home by 3 Bedrooms
Then A list of homes that matches the Bedrooms specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Searching House by Bathrooms  
When I search about home by 2 Bathrooms
Then A list of homes that matches the Bathrooms specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Searching House by Pets
When I search about home by "no" Pets
Then A list of homes that matches the Pets specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

 Scenario: Search about home by LeaseLength
When I search about home by 6 months LeaseLength
Then A list of homes that matches the LeaseLength specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about home by Amenities
When I search about home with "ELEVATOR,fireplace"
Then A list of homes that matches the Amenities specification should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about two or more features
When I search about home by "city"
And  I search about home by "wood"
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"


Scenario: Search about two or more features
When I search about home by "village"
And  I search about home by "wood" 
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about two or more features
When I search about home by "village"
And  I search about home by "no" Pets
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about two or more features
When I search about home by "village"
And  I search about home by "no" Pets
And  I search about home by "House"
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about two or more features
When I search about home by "village"
And  I search about home by "no" Pets
And  I search about home by "Apartment"
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about two or more features 
When I search about home by "village"
And  I search about home by "no" Pets
And  I search about home by "House"
And  I search about home by "wood"
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"


Scenario: Search about two or more features
When I search about home by "village"
And  I search about home by "no" Pets
And  I search about home by 6 months LeaseLength
And  I search about home with "ELEVATOR"
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"

Scenario: Search about two or more features
When I search about home by "village"
And  I search about home by "no" Pets
And  I search about home by 6 months LeaseLength
And  I search about home with "ELEVATOR,SwimmingPool"
Then  A list of homes that match the many Specifications should be returned and printed on the console
And email with the result should be send to user "Hayamikkawi833@gmail.com"






