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

object FA_HANDS_PRAYING: Icon {
	
	override val name get() = "Hands praying"
	
	override val unicode get() = "f684"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M272 191.9c-17.62 0-32 14.35-32 31.97V303.9c0 8.875-7.125 16-16 16s-16-7.125-16-16V227.4c0-17.37 4.75-34.5 13.75-49.37L299.5 48.41c9-15.12 4.125-34.76-11-43.88C273.1-4.225 255.8 .1289 246.1 13.63C245.1 13.88 245.5 13.88 245.4 14.13L128.1 190C117.5 205.9 112 224.3 112 243.3v80.24l-90.13 29.1C8.75 357.9 0 370.1 0 383.9v95.99c0 10.88 8.5 31.1 32 31.1c2.75 0 5.375-.25 8-1l179.3-46.62C269.1 450 304 403.8 304 351.9V223.9C304 206.3 289.6 191.9 272 191.9zM618.1 353.6L528 323.6V243.4c0-19-5.5-37.37-16.12-53.25l-117.3-175.9c-.125-.25-.6251-.2487-.75-.4987c-9.625-13.5-27.88-17.85-42.38-9.229c-15.12 9.125-20 28.76-11 44.01l77.75 129.5C427.3 193 432 210 432 227.5v76.49c0 8.875-7.125 16-16 16s-16-7.125-16-16V223.1c0-17.62-14.38-31.97-32-31.97s-32 14.38-32 31.1v127.1c0 51.87 34.88 98.12 84.75 112.4L600 511C602.6 511.6 605.4 512 608 512c23.5 0 32-21.25 32-31.1v-95.99C640 370.3 631.3 358 618.1 353.6z"/></svg>"""
		else -> null
	}
	
}

val FA_PRAYING_HANDS = FA_HANDS_PRAYING
