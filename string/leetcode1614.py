class Solution(object):
    def maxDepth(self, s):
        depth=0
        maxdepth=0
        for ch in s:
            if ch==")":
                depth=depth-1
                continue
            if ch!="(":
                continue
            depth=depth+1

            if maxdepth < depth:
                maxdepth=depth
        return maxdepth
        
