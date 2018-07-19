class sett:
    def __init__(self,lower_bound,upper_bound):
        self.lower_bound=lower_bound
        self.upper_bound=upper_bound
class sets:
    def __init__(self):
        self.union=[]
    def closed_intervals(self,u):
        self.union.append(u)
        self.union.sort()
    def compare(self):
            for i in self.union:
                for j in self.union:
                    if j[0:] > i[0:]:
                        if j[1]>i[0]:
                            w = sett(j[1],i[0])
                            s.closed_intervals(w)
                            del i[1:]
                            break
                        else:
                            del i[1:]
                            break
                    else:
                        pass
            
        
    
class UI:
    def input(self):
        n = int(input("Enter the number of sets to be entered:"))
        s = sets()
        for i in range(n):
            x = int(input("Enter the lower bound"))
            y = int(input("Enter the upper bound"))
            w = sett(x,y)
            s.closed_intervals(w)
            s.compare()
        return(s)       

    def print_output(self):
        #o = union()
        print("You are in OUTPUT")
         
u =  UI()
a=u.input()
c=u.print_output()
