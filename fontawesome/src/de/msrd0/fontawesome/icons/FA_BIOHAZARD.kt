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

/** Biohazard */
object FA_BIOHAZARD: Icon {
	
	override val name get() = "Biohazard"
	
	override val unicode get() = "f780"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M575.5 283.5c-13.13-39.11-39.5-71.98-74.13-92.35c-17.5-10.37-36.25-16.62-55.25-19.87c6-17.75 10-36.49 10-56.24c0-40.99-14.5-80.73-41-112.2c-2.5-3-6.625-3.623-10-1.75c-3.25 1.875-4.75 5.998-3.625 9.748c4.5 13.75 6.625 26.24 6.625 38.49c0 67.73-53.76 122.8-120 122.8s-120-55.11-120-122.8c0-12.12 2.25-24.74 6.625-38.49c1.125-3.75-.375-7.873-3.625-9.748c-3.375-1.873-7.502-1.25-10 1.75C134.7 34.3 120.1 74.04 120.1 115c0 19.75 3.875 38.49 10 56.24C111.2 174.5 92.32 180.8 74.82 191.1c-34.63 20.49-61.01 53.24-74.38 92.35c-1.25 3.75 .25 7.748 3.5 9.748c3.375 2 7.5 1.375 10-1.5c9.377-10.87 19-19.12 29.25-25.12c57.25-33.87 130.8-13.75 163.9 44.99c33.13 58.61 13.38 133.1-43.88 167.8c-10.25 6.123-22 10.37-35.88 13.37c-3.627 .875-6.377 4.25-6.377 8.123c.125 4 2.75 7.248 6.502 7.998c39.75 7.748 80.63 .7495 115.3-19.74c18-10.5 32.88-24.49 45.25-39.99c12.38 15.5 27.38 29.49 45.38 39.99c34.5 20.49 75.51 27.49 115.1 19.74c3.875-.75 6.375-3.998 6.5-7.998c0-3.873-2.625-7.248-6.375-8.123c-13.88-2.873-25.63-7.248-35.75-13.37c-57.38-33.87-77.01-109.2-44-167.8c33.13-58.73 106.6-78.85 164-44.99c10.12 6.123 19.75 14.25 29.13 25.12c2.5 2.875 6.752 3.5 10 1.5C575.4 291.2 576.9 287.2 575.5 283.5zM287.1 320.1c-26.5 0-48-21.49-48-47.99c0-26.49 21.5-47.99 48-47.99c26.5 0 48.01 21.49 48.01 47.99C335.1 298.6 314.5 320.1 287.1 320.1zM385 377.6c1.152 22.77 10.74 44.63 27.22 60.92c47.45-35.44 79.13-90.58 83.1-153.4c-22.58-6.173-45.69-2.743-65.57 8.76C424.7 326.9 408.5 355.1 385 377.6zM253.3 132.6c26.22-6.551 45.37-6.024 69.52 .0254c21.93-9.777 39.07-28.55 47.48-51.75C345 69.98 317.3 63.94 288.1 63.94c-29.18 0-56.96 5.986-82.16 16.84C214.3 103.1 231.4 122.8 253.3 132.6zM163.8 438.5c16.46-16.26 26.03-38.19 27.14-61.01c-23.49-21.59-39.59-50.67-44.71-83.6C126.9 282.7 103.8 278.8 80.67 285.1C84.64 347.9 116.3 403.1 163.8 438.5z"/></svg>"""
		else -> null
	}
	
}
