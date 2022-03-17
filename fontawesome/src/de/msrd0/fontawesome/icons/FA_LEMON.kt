/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID
import de.msrd0.fontawesome.Style.REGULAR

/** Lemon */
object FA_LEMON: Icon {
	
	override val name get() = "Lemon"
	
	override val unicode get() = "f094"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M427.9 52.1c-20.13-20.23-47.58-25.27-65.63-14.77c-51.63 30.08-158.6-46.49-281 75.91c-122.4 122.4-45.83 229.4-75.91 281c-10.5 18.05-5.471 45.5 14.77 65.63c20.13 20.24 47.58 25.27 65.63 14.77c51.63-30.08 158.6 46.49 281-75.91c122.4-122.4 45.83-229.4 75.91-281C453.2 99.69 448.1 72.23 427.9 52.1zM211.9 127.5C167.6 138.7 106.7 199.6 95.53 243.9C93.69 251.2 87.19 255.1 79.1 255.1c-1.281 0-2.594-.1562-3.906-.4687C67.53 253.4 62.34 244.7 64.47 236.1c14.16-56.28 83.31-125.4 139.6-139.6c8.656-2.031 17.25 3.062 19.44 11.62C225.7 116.7 220.5 125.3 211.9 127.5z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M439.9 144.6c15.34-26.38 8.372-62.41-16.96-87.62c-25.21-25.32-61.22-32.26-87.61-16.95c-9.044 5.218-27.15 3.702-48.08 1.968c-50.78-4.327-127.4-10.73-207.6 69.56C-.6501 191.9 5.801 268.5 10.07 319.3c1.749 20.96 3.28 39.07-1.984 48.08c-15.35 26.4-8.357 62.45 16.92 87.57c16.26 16.37 37.05 25.09 56.83 25.09c10.89 0 21.46-2.64 30.83-8.092c9.013-5.249 27.12-3.718 48.08-1.968c50.69 4.233 127.4 10.7 207.6-69.56c80.27-80.28 73.82-156.9 69.56-207.7C436.2 171.8 434.7 153.7 439.9 144.6zM398.4 120.5c-12.87 22.09-10.67 48.41-8.326 76.25c4.155 49.3 8.841 105.2-55.67 169.7c-64.53 64.49-120.5 59.78-169.7 55.68c-27.85-2.328-54.12-4.53-76.26 8.311c-6.139 3.64-19.17 1.031-29.58-9.451c-10.39-10.33-12.95-23.35-9.372-29.49c12.87-22.09 10.67-48.41 8.326-76.25C53.72 265.1 49.04 210.1 113.5 145.5c48.27-48.27 91.71-57.8 131.2-57.8c13.28 0 26.12 1.078 38.52 2.125c27.9 2.359 54.17 4.561 76.26-8.311c6.123-3.577 19.18-1.031 29.49 9.357C399.4 101.2 402 114.4 398.4 120.5zM239.5 124.1c2.156 8.561-3.062 17.25-11.62 19.43C183.6 154.7 122.7 215.6 111.6 259.9C109.7 267.1 103.2 271.1 96.05 271.1c-1.281 0-2.593-.1562-3.905-.4687C83.58 269.3 78.4 260.6 80.52 252.1C94.67 195.8 163.8 126.7 220.1 112.5C228.8 110.4 237.3 115.5 239.5 124.1z"/></svg>"""
		else -> null
	}
	
}
