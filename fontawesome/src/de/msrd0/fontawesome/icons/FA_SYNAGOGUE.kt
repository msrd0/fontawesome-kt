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

object FA_SYNAGOGUE: Icon {
	
	override val name get() = "Synagogue"
	
	override val unicode get() = "f69b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M70 196.51L6.67 268.29A26.643 26.643 0 0 0 0 285.93V512h128V239.58l-38-43.07c-5.31-6.01-14.69-6.01-20 0zm563.33 71.78L570 196.51c-5.31-6.02-14.69-6.02-20 0l-38 43.07V512h128V285.93c0-6.5-2.37-12.77-6.67-17.64zM339.99 7.01c-11.69-9.35-28.29-9.35-39.98 0l-128 102.4A32.005 32.005 0 0 0 160 134.4V512h96v-92.57c0-31.88 21.78-61.43 53.25-66.55C349.34 346.35 384 377.13 384 416v96h96V134.4c0-9.72-4.42-18.92-12.01-24.99l-128-102.4zm52.07 215.55c1.98 3.15-.29 7.24-4 7.24h-38.94L324 269.79c-1.85 2.95-6.15 2.95-8 0l-25.12-39.98h-38.94c-3.72 0-5.98-4.09-4-7.24l19.2-30.56-19.2-30.56c-1.98-3.15.29-7.24 4-7.24h38.94l25.12-40c1.85-2.95 6.15-2.95 8 0l25.12 39.98h38.95c3.71 0 5.98 4.09 4 7.24L372.87 192l19.19 30.56z"/></svg>"""
		else -> null
	}
	
}
