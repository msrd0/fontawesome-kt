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

object FA_PERSON_SWIMMING: Icon {
	
	override val name get() = "Person swimming"
	
	override val unicode get() = "f5c4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M192.4 320c63.38 0 54.09-39.67 95.33-40.02c42.54 .3672 31.81 40.02 95.91 40.02c39.27 0 55.72-18.41 62.21-24.83l-140.4-116.1c3.292-1.689 31.66-18.2 75.25-18.2c12.57 0 25.18 1.397 37.53 4.21l38.59 8.844c2.412 .5592 4.824 .8272 7.2 .8272c15.91 0 31.96-12.81 31.96-32.04c0-14.58-10.03-27.77-24.84-31.16l-38.59-8.844c-17.06-3.904-34.46-5.837-51.81-5.837c-120.1 0-177.4 85.87-178.1 88.02L179.1 213.3C158.1 241.3 147.4 273.8 145 307.7C157.5 315.4 174.3 320 192.4 320zM576 397c0-15.14-10.82-28.59-26.25-31.42c-48.52-8.888-45.5-29.48-69.6-29.48c-25.02 0-31.19 31.79-96.18 31.79c-48.59 0-72.72-22.06-73.38-22.62c-6.141-6.157-14.26-9.188-22.42-9.188c-24.75 0-31.59 31.81-96.2 31.81c-48.59 0-72.69-22.03-73.41-22.59c-6.125-6.157-14.3-9.245-22.46-9.245c-8.072 0-16.12 3.026-22.38 8.901c-29.01 26.25-73.75 12.54-73.75 52.08c0 16.08 12.77 32.07 31.71 32.07c9.77 0 39.65-7.34 64.26-21.84C115.5 418.8 147.4 431.1 192 431.1s76.5-13.12 96-24.66c19.53 11.53 51.47 24.59 96 24.59c44.59 0 76.56-13.09 96.06-24.62c24.71 14.57 54.74 21.83 64.24 21.83C563.2 429.1 576 413.3 576 397zM95.1 224c35.35 0 64-28.65 64-64c0-35.35-28.65-64-64-64s-64 28.65-64 64C31.1 195.3 60.65 224 95.1 224z"/></svg>"""
		else -> null
	}
	
}

val FA_SWIMMER = FA_PERSON_SWIMMING
