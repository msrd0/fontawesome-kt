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

object FA_HOT_DOG: Icon {
	
	override val name get() = "Hot Dog"
	
	override val unicode get() = "f80f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M488.6 23.44c-31.06-31.19-81.76-31.16-112.8 .0313L24.46 374.8c-20.83 19.96-29.19 49.66-21.83 77.6c7.36 27.94 29.07 49.65 57.02 57.01c27.94 7.36 57.64-1 77.6-21.83l351.3-351.3C519.7 105.2 519.8 54.5 488.6 23.44zM438.8 118.4c-19.59 19.59-37.39 22.52-51.74 25.01c-12.97 2.246-22.33 3.867-34.68 16.22c-12.35 12.35-13.97 21.71-16.22 34.69c-2.495 14.35-5.491 32.19-25.08 51.78c-19.59 19.59-37.43 22.58-51.78 25.08C246.3 273.4 236.9 275.1 224.6 287.4c-12.35 12.35-13.97 21.71-16.22 34.68C205.9 336.4 202.9 354.3 183.3 373.9c-19.59 19.59-37.43 22.58-51.78 25.08C118.5 401.2 109.2 402.8 96.83 415.2c-6.238 6.238-16.34 6.238-22.58 0c-6.238-6.238-6.238-16.35 0-22.58c19.59-19.59 37.43-22.58 51.78-25.07c12.97-2.245 22.33-3.869 34.68-16.22c12.35-12.35 13.97-21.71 16.22-34.69c2.495-14.35 5.492-32.19 25.08-51.78s37.43-22.58 51.78-25.08c12.97-2.246 22.33-3.869 34.68-16.22s13.97-21.71 16.22-34.68c2.495-14.35 5.492-32.19 25.08-51.78c19.59-19.59 37.43-22.58 51.78-25.07c12.97-2.246 22.28-3.815 34.63-16.17c6.238-6.238 16.36-6.238 22.59 0C444.1 102.1 444.1 112.2 438.8 118.4zM32.44 321.5l290-290l-11.48-11.6c-24.95-24.95-63.75-26.57-86.58-3.743L17.1 223.4C-5.73 246.3-4.108 285.1 20.84 310L32.44 321.5zM480.6 189.5l-290 290l11.48 11.6c24.95 24.95 63.75 26.57 86.58 3.743l207.3-207.3c22.83-22.83 21.21-61.63-3.743-86.58L480.6 189.5z"/></svg>"""
		else -> null
	}
	
}
