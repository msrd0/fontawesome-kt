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

/** Mars */
object FA_MARS: Icon {
	
	override val name get() = "Mars"
	
	override val unicode get() = "f222"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M431.1 31.1l-112.6 0c-21.42 0-32.15 25.85-17 40.97l29.61 29.56l-56.65 56.55c-30.03-20.66-65.04-31-100-31c-47.99-.002-95.96 19.44-131.1 58.39c-60.86 67.51-58.65 175 4.748 240.1C83.66 462.2 129.6 480 175.5 480c45.12 0 90.34-17.18 124.8-51.55c61.11-60.99 67.77-155.6 20.42-224.1l56.65-56.55l29.61 29.56C411.9 182.2 417.9 184.4 423.8 184.4C436.1 184.4 448 174.8 448 160.4V47.1C448 39.16 440.8 31.1 431.1 31.1zM243.5 371.9c-18.75 18.71-43.38 28.07-68 28.07c-24.63 0-49.25-9.355-68.01-28.07c-37.5-37.43-37.5-98.33 0-135.8c18.75-18.71 43.38-28.07 68.01-28.07c24.63 0 49.25 9.357 68 28.07C281 273.5 281 334.5 243.5 371.9z"/></svg>"""
		else -> null
	}
	
}
