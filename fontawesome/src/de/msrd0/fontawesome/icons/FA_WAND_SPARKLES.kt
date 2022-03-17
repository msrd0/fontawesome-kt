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

/** Wand sparkles */
object FA_WAND_SPARKLES: Icon {
	
	override val name get() = "Wand sparkles"
	
	override val unicode get() = "f72b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M3.682 149.1L53.32 170.7L74.02 220.3c1.016 2.043 3.698 3.696 5.977 3.696c.0078 0-.0078 0 0 0c2.271-.0156 4.934-1.661 5.946-3.696l20.72-49.63l49.62-20.71c2.023-1.008 3.68-3.681 3.691-5.947C159.1 141.7 158.3 139 156.3 138L106.9 117.4L106.5 117L85.94 67.7C84.93 65.66 82.27 64.02 80 64c-.0078 0 .0078 0 0 0c-2.279 0-4.966 1.649-5.981 3.692L53.32 117.3L3.682 138C1.652 139.1 0 141.7 0 144C0 146.3 1.652 148.9 3.682 149.1zM511.1 368c-.0039-2.273-1.658-4.95-3.687-5.966l-49.57-20.67l-20.77-49.67C436.9 289.7 434.3 288 432 288c-2.281 0-4.948 1.652-5.964 3.695l-20.7 49.63l-49.64 20.71c-2.027 1.016-3.684 3.683-3.687 5.956c.0039 2.262 1.662 4.954 3.687 5.966l49.57 20.67l20.77 49.67C427.1 446.3 429.7 448 432 448c2.277 0 4.944-1.656 5.96-3.699l20.69-49.63l49.65-20.71C510.3 372.9 511.1 370.3 511.1 368zM207.1 64l12.42 29.78C221 95.01 222.6 96 223.1 96s2.965-.9922 3.575-2.219L239.1 64l29.78-12.42c1.219-.6094 2.215-2.219 2.215-3.578c0-1.367-.996-2.969-2.215-3.578L239.1 32L227.6 2.219C226.1 .9922 225.4 0 223.1 0S221 .9922 220.4 2.219L207.1 32L178.2 44.42C176.1 45.03 176 46.63 176 48c0 1.359 .9928 2.969 2.21 3.578L207.1 64zM399.1 191.1c8.875 0 15.1-7.127 15.1-16v-28l91.87-101.7c5.75-6.371 5.5-15.1-.4999-22.12L487.8 4.774c-6.125-6.125-15.75-6.375-22.12-.625L186.6 255.1H144c-8.875 0-15.1 7.125-15.1 15.1v36.88l-117.5 106c-13.5 12.25-14.14 33.34-1.145 46.34l41.4 41.41c12.1 12.1 34.13 12.36 46.37-1.133l279.2-309.5H399.1z"/></svg>"""
		else -> null
	}
	
}
