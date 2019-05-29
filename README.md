There are N traders on the market asking for N different prices
for N different assets.
There are also M buyers offering the bid price.
At each time unit, all buyers simultaneously decide what assets they want to buy from what traders in certain volumes.

Each trader is a thread in a shared market memory.
Every thread is expected to generate a random number. After random number of seconds, buyers decide to buy an asset.
No counter-offers or counter-bids are allowed for both sides.

