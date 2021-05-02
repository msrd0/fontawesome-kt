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

object FA_SPA: Icon {
	
	override val name get() = "Spa"
	
	override val unicode get() = "f5bb"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M568.25 192c-29.04.13-135.01 6.16-213.84 83-33.12 29.63-53.36 63.3-66.41 94.86-13.05-31.56-33.29-65.23-66.41-94.86-78.83-76.84-184.8-82.87-213.84-83-4.41-.02-7.79 3.4-7.75 7.82.23 27.92 7.14 126.14 88.77 199.3C172.79 480.94 256 480 288 480s115.19.95 199.23-80.88c81.64-73.17 88.54-171.38 88.77-199.3.04-4.42-3.34-7.84-7.75-7.82zM287.98 302.6c12.82-18.85 27.6-35.78 44.09-50.52 19.09-18.61 39.58-33.3 60.26-45.18-16.44-70.5-51.72-133.05-96.73-172.22-4.11-3.58-11.02-3.58-15.14 0-44.99 39.14-80.27 101.63-96.74 172.07 20.37 11.7 40.5 26.14 59.22 44.39a282.768 282.768 0 0 1 45.04 51.46z"/></svg>"""
		else -> null
	}
	
}
