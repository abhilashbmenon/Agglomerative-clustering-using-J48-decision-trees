#Agglomerative-clustering-using-J48-decision-trees
This method of finding “smart profiles” for users of an IoT environment follows a hierarchical bottom-up (or agglomerative) approach. It first fits a separate decision tree for each participant, and then iteratively merges these trees based on similarity.
Note: Each participant has 14 instances (corresponding to the 14 IoT scenarios that he was subjected to) and all 14 instances pertinent to one participant were treated as a single data point for this approach. This was done to make sure that a participant's input regarding his 'privacy' is not being considered out of context while buiding decision trees.
Unfortunately, I won't be able to post data that is used in here; it is part of ongoing research and a paper under review.
