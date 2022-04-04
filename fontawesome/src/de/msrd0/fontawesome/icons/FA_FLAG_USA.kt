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

/** United States of America Flag */
object FA_FLAG_USA: Icon {
	
	override val name get() = "United States of America Flag"
	
	override val unicode get() = "f74d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M544 61.63V30.74c0-25-28.81-37.99-53.17-26.49C306.3 91.5 321.5-62.25 96 32.38V32c0-17.75-14.25-32-32-32S32 14.25 32 32L31.96 496c0 8.75 7.25 16 15.1 16H80C88.75 512 96 504.8 96 496V384c200-92.25 238.8 53.25 428.1-23.12C536.3 355.9 544 344.4 544 332.1V296.1c-46.98 17.25-86.42 24.12-120.8 24.12c-40.25-.125-74.17-8.5-107.7-16.62C254 288.5 195.3 274.8 96 314.8v-34.5c102-37.63 166.5-22.75 228.4-7.625C385.1 287.8 444.7 301.4 544 261.5V200c-46.98 17.25-86.42 24.12-120.8 24.12c-40.25 0-74.17-8.375-107.7-16.5C254 192.5 195.3 178.8 96 218.8v-34.5c102-37.5 166.5-22.62 228.4-7.5C385.1 191.8 444.7 205.4 544 165.6V96.75c-57.75 23.5-100.4 31.38-135.8 31.38c-62.96 0-118.9-27.09-120.2-27.38V67.5C331.9 78.94 390.1 128.3 544 61.63zM160 136c-8.75 0-16-7.125-16-16s7.25-16 16-16s16 7.125 16 16S168.8 136 160 136zM160 72c-8.75 0-16-7-16-16c0-8.75 7.25-16 16-16s16 7.125 16 16S168.8 72 160 72zM224 128C215.3 128 208 120.9 208 112S215.3 96 224 96s16 7 16 16C240 120.8 232.8 128 224 128zM224 64.25c-8.75 0-16-7-16-16c0-8.75 7.25-16 16-16s16 7.125 16 16S232.8 64.25 224 64.25z"/></svg>"""
		else -> null
	}
	
}