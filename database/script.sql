USE [Project]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/22/2022 2:17:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Account](
	[AccountID] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](30) NOT NULL,
	[password] [varchar](30) NULL,
	[name] [varchar](30) NOT NULL,
	[amount] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Category]    Script Date: 3/22/2022 2:17:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[CategoryID] [int] IDENTITY(1,1) NOT NULL,
	[Categoryname] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Order]    Script Date: 3/22/2022 2:17:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Order](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[Date] [varchar](50) NULL,
	[Total] [float] NULL,
	[AccountID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 3/22/2022 2:17:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[OrderDetailID] [int] IDENTITY(1,1) NOT NULL,
	[ProductID] [int] NULL,
	[OrderID] [int] NULL,
	[Quantity] [int] NULL,
	[ProductPrice] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Product]    Script Date: 3/22/2022 2:17:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[ProductID] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
	[price] [float] NULL,
	[discount] [int] NULL,
	[image] [varchar](50) NULL,
	[color] [varchar](55) NULL,
	[Size] [int] NULL,
	[quantity] [int] NULL,
	[CategoryID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([AccountID], [username], [password], [name], [amount]) VALUES (1, N'admin', N'admin', N'ADMIN', 145000)
INSERT [dbo].[Account] ([AccountID], [username], [password], [name], [amount]) VALUES (2, N'duc', N'123', N'ANH DUC', 230000)
INSERT [dbo].[Account] ([AccountID], [username], [password], [name], [amount]) VALUES (3, N'ha', N'123', N'BAO HA', 234500)
INSERT [dbo].[Account] ([AccountID], [username], [password], [name], [amount]) VALUES (4, N'duy', N'123', N'HAI DUY', -16700)
INSERT [dbo].[Account] ([AccountID], [username], [password], [name], [amount]) VALUES (5, N'huyen', N'123', N'NGUYEN HUYEN', 765000)
INSERT [dbo].[Account] ([AccountID], [username], [password], [name], [amount]) VALUES (6, N'viet', N'123', N'LE VIET', 335000)
SET IDENTITY_INSERT [dbo].[Account] OFF
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([CategoryID], [Categoryname]) VALUES (1, N'Iphone SE')
INSERT [dbo].[Category] ([CategoryID], [Categoryname]) VALUES (2, N'Iphone 7')
INSERT [dbo].[Category] ([CategoryID], [Categoryname]) VALUES (3, N'Iphone 8')
INSERT [dbo].[Category] ([CategoryID], [Categoryname]) VALUES (4, N'Iphone XSM')
INSERT [dbo].[Category] ([CategoryID], [Categoryname]) VALUES (5, N'Iphone 11')
INSERT [dbo].[Category] ([CategoryID], [Categoryname]) VALUES (6, N'Iphone 12')
INSERT [dbo].[Category] ([CategoryID], [Categoryname]) VALUES (7, N'Iphone 13')
SET IDENTITY_INSERT [dbo].[Category] OFF
SET IDENTITY_INSERT [dbo].[Order] ON 

INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (1, N'24/03/2021', 19000, 1)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (2, N'15/01/2021', 22000, 2)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (3, N'22/08/2021', 4500, 3)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (4, N'14/02/2021', 16000, 4)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (5, N'17/09/2021', 9500, 5)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (6, N'19/06/2021', 9000, 6)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (7, N'2022-03-15', 132000, 4)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (8, N'2022-03-15', 7700, 4)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (9, N'2022-03-15', 3000, 4)
INSERT [dbo].[Order] ([OrderID], [Date], [Total], [AccountID]) VALUES (10, N'2022-03-15', 3000, 4)
SET IDENTITY_INSERT [dbo].[Order] OFF
SET IDENTITY_INSERT [dbo].[OrderDetail] ON 

INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (1, 5, 1, 2, 5000)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (2, 4, 2, 1, 4000)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (3, 9, 3, 3, 13000)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (4, 12, 4, 2, 22000)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (5, 3, 5, 1, 4500)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (6, 1, 6, 2, 4700)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (7, 2, 7, 44, 3000)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (8, 1, 8, 1, 4700)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (9, 2, 8, 1, 3000)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (10, 2, 9, 1, 3000)
INSERT [dbo].[OrderDetail] ([OrderDetailID], [ProductID], [OrderID], [Quantity], [ProductPrice]) VALUES (11, 2, 10, 1, 3000)
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (1, N'Iphone SE', 4700, 10, N'images/se2020.jpg', N'white', 64, 99, 1)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (2, N'Iphone 7G', 3000, 20, N'images/7g.jpg', N'black', 32, 3, 2)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (3, N'Iphone 7 Plus', 4500, 10, N'images/7plus.jpg', N'pink', 64, 100, 2)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (4, N'Iphone 8G', 4000, 10, N'images/8g.jpg', N'red', 32, 60, 3)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (5, N'Iphone 8 Plus', 5000, 15, N'images/8plus.jpg', N'pink', 128, 60, 3)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (6, N'Iphone XSM', 9000, 15, N'images/xsm.jpg', N'gold', 64, 70, 4)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (7, N'Iphone XSM GRAY', 9500, 20, N'images/xsmg.jpg', N'black', 64, 80, 4)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (8, N'Iphone 11', 11000, 25, N'images/11.jpg', N'white', 64, 90, 5)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (9, N'Iphone 11 PRO', 13000, 15, N'images/11pro.jpg', N'white', 64, 100, 5)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (10, N'Iphone 11 PRM', 16000, 30, N'images/11prm.jpg', N'black', 128, 50, 5)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (11, N'Iphone 12', 19000, 25, N'images/12.jpg', N'blue', 128, 60, 6)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (12, N'Iphone 12 PRM', 22000, 25, N'images/12prm.jpg', N'gold', 256, 60, 6)
INSERT [dbo].[Product] ([ProductID], [name], [price], [discount], [image], [color], [Size], [quantity], [CategoryID]) VALUES (13, N'Iphone 13', 24000, 10, N'images/13.jpg', N'pink', 512, 70, 7)
SET IDENTITY_INSERT [dbo].[Product] OFF
ALTER TABLE [dbo].[Order]  WITH CHECK ADD FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([AccountID])
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD FOREIGN KEY([OrderID])
REFERENCES [dbo].[Order] ([OrderID])
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD FOREIGN KEY([ProductID])
REFERENCES [dbo].[Product] ([ProductID])
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Category] ([CategoryID])
GO
